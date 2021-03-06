/**
 * Copyright (c) 2012 Todoroo Inc
 *
 * See the file "LICENSE" for the full license governing this code.
 */
package com.todoroo.astrid.notes;

import android.app.PendingIntent;
import android.graphics.drawable.BitmapDrawable;

import com.todoroo.astrid.api.TaskAction;

public class NotesAction extends TaskAction {

    public NotesAction(PendingIntent intent, BitmapDrawable icon) {
        super(intent, icon);
    }
}
