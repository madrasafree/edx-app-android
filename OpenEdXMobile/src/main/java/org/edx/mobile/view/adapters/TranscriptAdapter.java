package org.edx.mobile.view.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import org.edx.mobile.R;
import org.edx.mobile.core.IEdxEnvironment;
import org.edx.mobile.util.TextUtils;

import javax.inject.Inject;

import subtitleFile.Caption;

public class TranscriptAdapter extends BaseListAdapter<Caption> {
    @ColorInt
    private final int SELECTED_TRANSCRIPT_COLOR = ContextCompat.getColor(getContext(), R.color.neutralBlack);
    @ColorInt
    private final int UNSELECTED_TRANSCRIPT_COLOR = ContextCompat.getColor(getContext(), R.color.primaryBaseColor);

    @Inject
    public TranscriptAdapter(Context context, IEdxEnvironment environment) {
        super(context, R.layout.row_transcript_item, environment);
    }

    @Override
    public void render(BaseViewHolder tag, Caption model) {
        final ViewHolder viewHolder = (ViewHolder) tag;
        String captionText = model.content;
        if (captionText.endsWith("<br />")) {
            captionText = captionText.substring(0, captionText.length() - 6);
        }
        viewHolder.transcriptTv.setText(TextUtils.formatHtml(captionText));
        final int position = getPosition(model);
        if (isSelected(position)) {
            viewHolder.transcriptTv.setTextColor(SELECTED_TRANSCRIPT_COLOR);
            Typeface typefaceBold = ResourcesCompat.getFont(getContext(), R.font.abraham_regular);
            viewHolder.transcriptTv.setTypeface(typefaceBold);
        } else {
            viewHolder.transcriptTv.setTextColor(UNSELECTED_TRANSCRIPT_COLOR);
            Typeface typefaceLight = ResourcesCompat.getFont(getContext(), R.font.abraham_light);
            viewHolder.transcriptTv.setTypeface(typefaceLight);
        }
    }

    @Override
    public BaseViewHolder getTag(View convertView) {
        return new ViewHolder(convertView);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    private static class ViewHolder extends BaseViewHolder {
        final TextView transcriptTv;

        public ViewHolder(View convertView) {
            transcriptTv = (TextView) convertView.findViewById(R.id.transcript_item);
        }
    }
}
