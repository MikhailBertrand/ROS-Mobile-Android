package com.schneewittchen.rosandroid.widgets.gridmap;

import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;

import com.schneewittchen.rosandroid.R;
import com.schneewittchen.rosandroid.ui.fragments.details.WidgetChangeListener;
import com.schneewittchen.rosandroid.ui.views.BaseDetailViewHolder;


/**
 * TODO: Description
 *
 * @author Nico Studt
 * @version 1.0.1
 * @created on 13.02.20
 * @updated on 13.05.20
 * @modified by Nico Studt
 */
public class GridMapDetailVH extends BaseDetailViewHolder<GridMapEntity> {

    EditText topicNameText;
    EditText topicTypeText;


    public GridMapDetailVH(@NonNull View view, WidgetChangeListener updateListener) {
        super(view, updateListener);
    }


    @Override
    public void init(View view) {
        topicNameText = view.findViewById(R.id.topicNameText);
        topicTypeText = view.findViewById(R.id.topicTypeText);
    }

    @Override
    public void bind(GridMapEntity entity) {
        topicNameText.setText(entity.topic.name);
        topicTypeText.setText(entity.topic.type);
    }

    @Override
    public void updateEntity() {
        this.widget.topic.type = topicTypeText.getText().toString();
        this.widget.topic.name = topicNameText.getText().toString();
    }
}