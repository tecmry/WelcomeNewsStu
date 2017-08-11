package freshmanspecial.mredrock.com.newstudents.View;

import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.Transformation;

import java.text.DecimalFormat;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.PieChartData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.utils.DensityUtil;
public class PieChartView extends View {

    /**
     * 画有颜色圆的Paint
     * */
    private static Paint mPaint;
    /**
     * 话透明圆的Paint
     * */
    private static Paint Transparent_Paint;
    /**
     * 百分比字体的Paint
     */
    private static Paint TextPaint;

    private static Paint  mInnerPaint ;


    /**
     * 饼状图动画时间
     * */
    private static final int AnnimationDuration = 500;

    /**
     * 绘制扇形的数组
     * */
    private static float[] rec;
    /**
     * 半径数组
     * */
    private static float[] getRadius = new float[3];

    /**
     * Paint的颜色
     * */
    public static int[] color;

    public static int[] transparentcolor;
    /**
     * 传来的数据List
     * */
    private List<PieChartData> DataList;

    /**
     * 圆周率
     * */
    private static final float PI = 3.1415f;

    /**
     * 控制View的大小
     * */
    private static int length;
    private static final double CircleWidth =4.5;
    private static int PartOne = 1;

    private static int PartTwo = 2;

    private static int PartThree = 3;
    private PieChartAnimation ChartAnimation;
    private static final int PieAnimationValue = 100;


    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 800;

    // private  double OutsideRadius = DensityUtil.dip2px(getContext(), 50) + CircleWidth ;
    /**
     * 初始画弧角度
     * */
    private static final int StartDegree = -90;

    private RectF InsideRectF = new RectF();

    private RectF MiddleRectF = new RectF();

    private RectF OutSideRectF = new RectF();

    private int OutsideRadius;
    private int MiddleRadius;
    private int InsideRadius;

    private int centerX;
    private int centerY;

    /**
     * 数据画笔
     */
    private Paint dataPaint;

    /**
     * 数据文本的大小
     */
    private Rect dataTextBound = new Rect();

    private int  rect[] = new int[]{-20, -15, -10};
    public PieChartView(Context context) {
        super(context);
        init(context);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    /**
     * 对Paint进行初始化
     * */
    public void init(Context context)
    {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(DensityUtil.dip2px(context,20));
        mPaint.setDither(true);
        ChartAnimation = new PieChartAnimation();
        ChartAnimation.setDuration(AnnimationDuration);
        ChartAnimation.setStartTime(500);
        Transparent_Paint =new Paint();
        Transparent_Paint.setStrokeWidth(DensityUtil.dip2px(context,20));
        Transparent_Paint.setAntiAlias(true);
        Transparent_Paint.setStyle(Paint.Style.STROKE);
        dataPaint = new Paint();
        dataPaint.setStrokeWidth(3);
        dataPaint.setTextSize(28);
        dataPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (DataList!=null&& !DataList.isEmpty()&&color[0]!=0)
        {
            float PieChart = StartDegree;
            if (rec==null)
            {
                rec = new float[3];
            }
            Log.d("TAG","DataListSize： " + DataList.size());
            for (int i = 0 ;i < DataList.size(); i++) {
                RectF rectF = new RectF();

                if (DataList.size() == 2) {
                    rectF = setRectF(getRadius[i+1], rectF);
                    mPaint.setColor(getResources().getColor(color[i]));
                    mPaint.setMaskFilter(new EmbossMaskFilter(new float[]{17, -10, 37}, 28, 23
                            , 0.925f * getRadius[i + 1]));
                    dataPaint.setColor(getResources().getColor(color[i]));
                    Transparent_Paint.setColor(getResources().getColor(transparentcolor[i]));
                    canvas.drawArc(rectF, PieChart + DataList.get(i).getValue() * 360, 360 - DataList.get(i).getValue(), false, Transparent_Paint);
                    canvas.drawArc(rectF, PieChart, DataList.get(i).getValue() * 360, false, mPaint);
                    drawData(canvas, rect[i], 1, DataList.get(i).getValue(), getRadius[i]);
                }else if (DataList.size() == 3 )
                {
                    rectF = setRectF(getRadius[i], rectF);
                    mPaint.setColor(getResources().getColor(color[i]));
                    mPaint.setMaskFilter(new EmbossMaskFilter(new float[]{17, -10, 37}, 28, 23
                            , 0.925f * getRadius[i]));
                    dataPaint.setColor(getResources().getColor(color[i]));
                    Transparent_Paint.setColor(getResources().getColor(transparentcolor[i]));
                    canvas.drawArc(rectF, PieChart + DataList.get(i).getValue() * 360, 360 - DataList.get(i).getValue(), false, Transparent_Paint);
                    canvas.drawArc(rectF, PieChart, DataList.get(i).getValue() * 360, false, mPaint);
                    drawData(canvas, rect[i], 1, DataList.get(i).getValue(), getRadius[i]);
                }
            }
        }else
        {
            mPaint.setColor(getResources().getColor(R.color.white));
            Transparent_Paint.setColor(getResources().getColor(R.color.white));
            dataPaint.setColor(getResources().getColor(R.color.white));
        }


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measureWidthSize = MeasureSpec.getSize(widthMeasureSpec);
        int measureHeightSize = MeasureSpec.getSize(heightMeasureSpec);
        int measureWidthMode = MeasureSpec.getMode(widthMeasureSpec);
        int measureHeightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (measureWidthMode == MeasureSpec.AT_MOST
                && measureHeightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        } else if (measureWidthMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(DEFAULT_WIDTH, measureHeightSize);
        } else if (measureHeightMode == MeasureSpec.AT_MOST) {
            setMeasuredDimension(measureWidthSize, DEFAULT_HEIGHT);
        }

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerX = getMeasuredWidth() / 2;
        centerY = getMeasuredHeight() / 2;
        //设置半径为宽高最小值的1/4
        // radius = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 4;
        getRadius[2]= (Math.min(getMeasuredWidth(), getMeasuredHeight()) / 16)*4;
        getRadius [1]= (Math.min(getMeasuredWidth(), getMeasuredHeight()) /16)*3;
        getRadius[0] = (Math.min(getMeasuredWidth(), getMeasuredHeight()) /16)*2;
    }

    private class PieChartAnimation extends Animation
    {
        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            rec = new float[DataList.size()];

            if (interpolatedTime<1.0f)
            {
                for (int i = 0 ; i < DataList.size(); i++) {
                    rec[i] = (DataList.get(i).getValue() * PieAnimationValue) *
                            interpolatedTime / PieAnimationValue * 360;
                }
            }else
            {
                for (int i = 0; i < DataList.size() ; i++)
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
    public double setOuterRadius(float radius) {
        double mRadius = DensityUtil.dip2px(getContext(), radius) + CircleWidth ;
        return mRadius;
    }

    /**
     * 初始化绘制弧形所在矩形的四点坐标
     **/
    private RectF setRectF(float mRadius,RectF rectF) {
        rectF.left = centerX - mRadius;
        rectF.top = centerY - mRadius;
        rectF.right = centerX + mRadius;
        rectF.bottom =centerY + mRadius;
        return rectF;
    }
    private float[] calculatePosition(float degree,float radius) {
        //由于Math.sin(double a)中参数a不是度数而是弧度，所以需要将度数转化为弧度
        //而Math.toRadians(degree)的用就是将度数转化为弧度
        //sin 一二正，三四负 sin（180-a）=sin(a)
        //扇形弧线中心点距离圆心的x坐标
        float x = (float) (Math.sin(Math.toRadians(degree)) * radius);
        //cos 一四正，二三负
        //扇形弧线中心点距离圆心的y坐标
        float y = (float) (Math.cos(Math.toRadians(degree)) * radius);
        //每段弧度的中心坐标(扇形弧线中心点相对于view的坐标)
        float startX = centerX + x;
        float startY = centerY - y;

        float[] position = new float[2];
        position[0] = startX;
        position[1] = startY-8;
        return position;
    }
    private void drawData(Canvas canvas, float degree, int i, float percent,float radius) {
        //弧度中心坐标
        float startX = calculatePosition(degree,radius)[0];
        float startY = calculatePosition(degree,radius)[1];
        //拼接百分比并获取文本大小
        DecimalFormat df = new DecimalFormat("0.0");
        String percentString = df.format(percent * 100) + "%";
        dataPaint.getTextBounds(percentString, 0, percentString.length(), dataTextBound);

        //绘制百分比数据，20为纵坐标偏移量
        canvas.drawText(percentString,
                startX - dataTextBound.width() / 2,
                startY + dataTextBound.height() * 2 - 25,
                dataPaint);
    }

    public void setColor(int color[],int transparentcolor[])
    {
        this.color = color;
        this.transparentcolor = transparentcolor;
    }
}
