package com.vae.wuyunxing.webdav.mobile.main.message;

public class CancellationEvent {

	public final boolean mIsUpload;
	public final long    mID;
	public final String  mFilename;
	public final boolean mIsSyncEvent;

	public CancellationEvent(boolean isUpload, long id, String filename, boolean isSyncEvent) {
		mIsUpload = isUpload;
		mID = id;
		mFilename = filename;
		mIsSyncEvent = isSyncEvent;
	}
}
