/*
 * Copyright (c) 2014. Marshal Chen.
 */

package com.marshalchen.common.uiModule.viewpagertransforms;

import android.view.View;

public class CubeOutTransformer extends ABaseTransformer {

	@Override
	protected void onTransform(View view, float position) {
		view.setPivotX(position < 0f ? view.getWidth() : 0f);
		view.setPivotY(view.getHeight() * 0.5f);
		view.setRotationY(90f * position);
	}

	@Override
	public boolean isPagingEnabled() {
		return true;
	}

}
