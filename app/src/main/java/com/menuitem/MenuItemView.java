package com.menuitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by zouhuan on 08/03/
 */

public class MenuItemView extends RelativeLayout {
    private ImageView mLeftImage;
    private TextView mLeftText;
    private TextView mRightText;

    public MenuItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context mContext, AttributeSet attrs) {
        inflate(mContext, R.layout.menu_item, this);
        mLeftImage = getView(R.id.icon_left);
        mLeftText = getView(R.id.menu_text_left);
        mRightText = getView(R.id.menu_text_right);
        //获取typedarray值
        TypedArray ta = mContext.obtainStyledAttributes(attrs, R.styleable.MenuItemView);
        int lefttextcolor = ta.getColor(R.styleable.MenuItemView_leftTextColor, Color.BLACK);
        int righttextcolor = ta.getColor(R.styleable.MenuItemView_rightTextColor, Color.GRAY);
        mLeftText.setTextColor(lefttextcolor);
        mRightText.setTextColor(righttextcolor);
        String lefttext = ta.getString(R.styleable.MenuItemView_lefttext);
        String righttext = ta.getString(R.styleable.MenuItemView_righttext);
        float textleftsize = ta.getDimension(R.styleable.MenuItemView_textSize, getResources().getDimension(R.dimen.textsize));
        mLeftText.setTextSize(textleftsize);
        if (lefttext != null) mLeftText.setText(lefttext);
        if (righttext != null) mRightText.setText(righttext);
        //回收
        ta.recycle();
    }

    public void setLeftText(String text) {
        mLeftText.setText(text);
    }

    public CharSequence getLeftText() {
        return mLeftText.getText();
    }

    public void setRightText(String text) {
        mRightText.setText(text);
    }

    public CharSequence getRightText() {
        return mRightText.getText();
    }

    public <T extends View> T getView(int id) {
        return (T) findViewById(id);
    }
}
