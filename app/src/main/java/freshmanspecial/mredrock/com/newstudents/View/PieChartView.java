package freshmanspecial.mredrock.com.newstudents.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

import java.util.List;
import freshmanspecial.mredrock.com.newstudents.Bean.PieChartData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.utils.DensityUtil;

/**
 * Created by Tecmry on 2017/8/3.
 */

public class PieChartView extends View{

    /**
     * 画最内圆的Paint
     * */
    private static Paint InsidePaint;

    /**
     * 画中间圆的Paint
     * */

    private static Paint MiddlePaint;
    /**
     * 画最外圆的Paint
     * */
    private static Paint OutsidePaint;

    /**
     * 百分比字体的Paint
     */
    private static Paint TextPaint;
    /**
     * 饼状图动画时间
     * */
    private static final int AnnimationDuration = 500;

    /**
     * 绘制扇形的数组
     * */
    private static float[] rec;

    /**
     * 传来的数据List
     * */
    private  List<PieChartData> DataList;

    /**
     * 圆周率
     * */
    private static final float PI = 3.1415f;

    private static final int CircleWidth = 3;
    private static int PartOne = 1;

    private static int PartTwo = 2;

    private static int PartThree = 3;
    private PieChartAnimation ChartAnimation;
    private static final int PieAnimationValue = 100;

   private  float OutsideRadius = DensityUtil.dip2px(getContext(), 60) + CircleWidth ;
    /**
     * 初始画弧角度
     * */
    private static final int StartDegree = -90;

    private RectF InsideRectF = new RectF();

    private RectF MiddleRectF = new RectF();

    private RectF OutSideRectF = new RectF();
    public PieChartView(Context context) {
        super(context);
        init();
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    /**
     * 对Paint进行初始化
     * */
    public void init()
    {
        InsidePaint = new Paint();
        InsidePaint.setAntiAlias(true);
        InsidePaint.setStyle(Paint.Style.FILL);
        ChartAnimation = new PieChartAnimation();
        ChartAnimation.setDuration(AnnimationDuration);

        MiddlePaint = new Paint();
        MiddlePaint.setAntiAlias(true);
        MiddlePaint.setStyle(Paint.Style.FILL);

        OutsidePaint = new Paint();
        OutsidePaint.setAntiAlias(true);
        OutsidePaint.setStyle(Paint.Style.FILL);

        TextPaint = new Paint();

        InsideRectF = setRectF(50,InsideRectF);
        MiddleRectF = setRectF(55,MiddleRectF);
        OutSideRectF = setRectF(60,OutSideRectF);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (DataList!=null&& !DataList.isEmpty())
        {
            float PieChart = StartDegree;
            if (rec==null)
            {
                rec = new float[3];
            }
            InsidePaint.setColor(getResources().getColor(R.color.special_2017_InsideCircle));
            float PieSweep_One = DataList.get(0).getValue()*360;
            canvas.drawArc(InsideRectF,PieChart,rec[0],true,InsidePaint);
            System.out.println(String.valueOf("Rec[0]"+rec[0]));
            //这里画出透明的圆
             MiddlePaint.setColor(getResources().getColor(R.color.special_2017_MiddleCircle));
            float PieSweep_Two = DataList.get(1).getValue()*360;
            canvas.drawArc(MiddleRectF,PieChart,rec[1],true,InsidePaint);
            System.out.println("Rec[1]" + rec[1]);
            OutsidePaint.setColor(Color.parseColor("#FBFEB8"));
            float PieSweep_Three = DataList.get(2).getValue() * 360;
            canvas.drawArc(OutSideRectF,PieChart,rec[2],true,InsidePaint);
            System.out.println("Rec[2]" + rec[2]);
        }else
        {
            InsidePaint.setColor(Color.parseColor("#fff"));
            MiddlePaint.setColor(Color.parseColor("#fff"));
            OutsidePaint.setColor(Color.parseColor("#fff"));
            TextPaint.setColor(Color.parseColor("#fff"));
        }

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int length = (int) (2 * OutsideRadius);
        setMeasuredDimension(length, length);
    }

    private class PieChartAnimation extends Animation
    {
        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            rec = new float[3];

            if (interpolatedTime<1.0f)
            {
                for (int i = 0 ; i < 3; i++) {
                    rec[i] = (DataList.get(i).getValue() * PieAnimationValue) *
                            interpolatedTime / PieAnimationValue * 360;
                }
            }else
            {
                for (int i = 0; i < 3 ; i++)
                {
                    rec[i] = DataList.get(i).getValue() * 360;
                }
            }
            invalidate();
        }
    }
    /**
     * 设置需要绘制的数据集合
     */
    public void setPieDataList(List<PieChartData> pieDataList) {
        this.DataList = pieDataList;
        if (rec == null) {
            rec = new float[DataList.size()];
        }
        startAnimation(ChartAnimation);
    }

    /**
     * 设置外圆半径
     *
     * @param radius 外圆半径 dp为单位
     **/
    public float setOuterRadius(float radius) {
        float mRadius = DensityUtil.dip2px(getContext(), radius) + CircleWidth ;
        return mRadius;
    }

    /**
     * 初始化绘制弧形所在矩形的四点坐标
     **/
    private RectF setRectF(float mRadius,RectF rectF) {
        float m = DensityUtil.dip2px(getContext(), mRadius) + CircleWidth ;
        rectF.left = 0;
        rectF.top = 0;
        rectF.right = 2 * m;
        rectF.bottom = 2 * m;
        return rectF;
    }

}
