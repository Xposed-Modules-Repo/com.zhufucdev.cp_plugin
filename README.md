
# Motion Emulator Content Provider Plugin

English | [中文](https://github.com/Xposed-Modules-Repo/com.zhufucdev.cp_plugin/blob/main/README_zh.md)

This is a Motion Emulator plug-in based on Content Provider.

Motion Emulator is an Xposed-enabled location simulator with support of continuous location and sensor fake.

This module enables its Xposed functionalities over a Content Provider based transmitting protocol.

> **warning**
> Usually avoid using the Content Provider plugin. It works only with host apps targeting sdk version 30 or lower. Because of the middle bridge, power consumption is higher. Moreover, future updates coming to Motion Emulator may not be implemented for this plug-in.

## Usage

When in use, you should select **only** the app to be tricked.
DO NOT enable for System Framework, which is untested and highly unstable.

### Motion Emulator Installation

To use this plug-in, Motion Emulator is to be installed, which provides emulation data using WebSocket and ProtoBuf for the host app.

You can download it from [my site](https://zhufucdev.com/article/qRnydwa-LGMhGrf43tSG_) or [GitHub](https://github.com/zhufucdev/MotionEmulator/releases).

It is also possible to find it in the LSPosed repository.

### Plugin Activation

After installation, activate it in Motion Emulator. You can find a more detailed guide from [here](https://zhufucdev.com/article/0xXK6YxSWe9nGwmmHQgsa).
