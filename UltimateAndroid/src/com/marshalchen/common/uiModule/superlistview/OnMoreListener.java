package com.marshalchen.common.uiModule.superlistview;

/**
 * Created by kentin on 24/04/14.
 */
public interface OnMoreListener {
    /**
     * @param numberOfItems
     * @param numberBeforeMore
     * @param currentItemPos
     */
    public void onMoreAsked(int numberOfItems, int numberBeforeMore, int currentItemPos);
}
