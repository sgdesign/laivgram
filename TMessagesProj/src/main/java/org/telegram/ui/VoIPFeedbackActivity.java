package org.laivgram.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.laivgram.messenger.AndroidUtilities;
import org.laivgram.messenger.LocaleController;
import org.laivgram.messenger.MessagesController;
import org.laivgram.messenger.R;
import org.laivgram.tgnet.ConnectionsManager;
import org.laivgram.tgnet.RequestDelegate;
import org.laivgram.tgnet.TLObject;
import org.laivgram.tgnet.TLRPC;
import org.laivgram.ui.ActionBar.AlertDialog;
import org.laivgram.ui.ActionBar.Theme;
import org.laivgram.ui.Components.BetterRatingView;
import org.laivgram.ui.Components.LayoutHelper;
import org.laivgram.ui.Components.voip.VoIPHelper;

public class VoIPFeedbackActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		super.onCreate(savedInstanceState);

		overridePendingTransition(0, 0);

		setContentView(new View(this));

		VoIPHelper.showRateAlert(this, new Runnable(){
			@Override
			public void run(){
				finish();
			}
		}, getIntent().getLongExtra("call_id", 0), getIntent().getLongExtra("call_access_hash", 0));
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(0, 0);
	}
}
