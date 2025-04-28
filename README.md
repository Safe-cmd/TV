# Simple Android TV Settings UI Example

这是一个示例 Android TV 应用，展示了如何构建一个简单的、基于网格的设置界面，并导航到各种设置子屏幕。它的视觉设计尝试模拟了一些 Android 驱动的电视/投影仪设备的常见设置菜单风格。

## 项目概述

本项目实现了一个基本的 Android TV 设置界面，包含了以下几个主要模块：

*   主设置菜单（网格布局）
*   网络设置
*   蓝牙设置
*   投影设置
*   图像与视频设置
*   声音设置
*   系统设置
*   信号源设置
*   智慧墙设置
*   关于本机

每个子设置界面都使用独立的 Activity 和布局文件来实现。界面元素使用了 `LinearLayout`, `GridLayout`, `TextView`, `ImageView`, `Button`, `Switch`, `RadioGroup`, `RadioButton` 等标准 Android 视图。应用背景（`@drawable/background_gradient`）被设计成可以与透明状态栏融合。

## 主要特点

*   **网格导航:** 主菜单采用三列的 `GridLayout`，提供清晰的导航入口。
*   **统一的视觉风格:** 使用共享的背景 Drawable 和 Item Selector Drawable (`@drawable/item_selectable_background`, `@drawable/radio_background_selector`) 来实现一致的UI元素外观和焦点反馈。
*   **透明状态栏:** 利用 `android:fitsSystemWindows="true"` 和 `WindowCompat.setDecorFitsSystemWindows(window, false)` 将内容绘制到状态栏下方，使背景与状态栏融为一体。
*   **子设置界面:** 每个设置分类对应一个独立的 Activity 和布局，便于模块化开发和管理。

## 设置和运行

1.  **克隆或下载:** 将项目代码克隆或下载到你的本地。
2.  **导入到 Android Studio:** 打开 Android Studio，选择 "Open an existing Android Studio project"，然后导航到项目所在的目录。
3.  **安装依赖:** Android Studio 会自动检测项目所需的依赖项（主要是一些 AndroidX 库）。等待 Gradle 同步完成。
4.  **解决资源文件缺失:** 如果在构建过程中遇到资源文件缺失的错误 (例如 Drawable 或 Color 不存在)，请根据错误信息创建对应的文件。本项目示例中使用了一些占位符和常用的名称，例如：
    *   `res/drawable/background_gradient.xml` (你的渐变背景)
    *   `res/drawable/edittext.xml` (基本按钮/项目背景)
    *   `res/drawable/radio_background_selector.xml` (RadioButton 的选中/非选中状态背景)
    *   `res/drawable/item_selectable_background.xml` (ListItem 的焦点/按下状态背景)
    *   `res/values/colors.xml` (包含 `white`, `orange`, `light_blue`, `white_50_transparent` 等颜色)
    *   各种图标文件 (如 `ic_wifi_signal_4.xml`, `ic_arrow_forward.xml` 等)。对于这些图标，推荐使用 Vector Asset Studio 从 Material Icons 中添加。
5.  **Clean and Rebuild:** 在菜单栏选择 `Build` -> `Clean Project`，然后选择 `Build` -> `Rebuild Project`。这有助于确保所有资源和代码都被正确编译。
6.  **连接设备或启动模拟器:** 连接一台 Android TV 设备或启动一个 Android TV 模拟器。
7.  **运行应用:** 点击 Android Studio 工具栏中的运行按钮（绿色三角形），选择目标设备，应用将构建并安装到设备上。

## 兼容性

本项目使用标准 Android 视图和 `androidx` 库，理论上可以在支持相应 API 等级（具体取决于你的 `build.gradle` 中的 `minSdkVersion`）的 Android 设备上运行，但布局和交互主要为 Android TV (使用 D-pad 导航) 设计。

## 贡献

欢迎任何对代码、UI/UX 改进、功能扩展等方面的贡献。

## 许可证

[待定]
