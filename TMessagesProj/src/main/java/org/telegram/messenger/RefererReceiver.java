/*
 * This is the source code of لایو گرام for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2017.
 */

package org.laivgram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RefererReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            MessagesController.getInstance().setReferer(intent.getExtras().getString("referrer"));
        } catch (Exception ignore) {

        }
    }
}
