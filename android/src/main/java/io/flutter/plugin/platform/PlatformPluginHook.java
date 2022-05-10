package io.flutter.plugin.platform;

import android.app.Activity;

import io.flutter.embedding.engine.systemchannels.PlatformChannel;

public class PlatformPluginHook extends PlatformPlugin {
    PlatformChannel platformChannelHook;
    
    public PlatformPluginHook(Activity activity, PlatformChannel platformChannel) {
        super(activity, platformChannel);
        platformChannelHook = platformChannel;
    }
    public PlatformPluginHook(Activity activity, PlatformChannel platformChannel, PlatformPluginDelegate delegate) {
        super(activity, platformChannel, delegate);
        platformChannelHook = platformChannel;
    }

    public PlatformChannel.PlatformMessageHandler getDefaultPlatformMessageHandler() {
        return mPlatformMessageHandler;
    }


    public PlatformChannel getPlatformChannel() {
        return platformChannelHook;
    }

}