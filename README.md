# 从应用 A 中打开应用 B

## 通过 Action 打开

在 B 的清单文件中添加过滤信息

```
 <intent-filter>
    <action android:name="transBundle.app" />
    <category android:name="android.intent.category.DEFAULT" />
  </intent-filter>
```

可以在启动activity中添加（action自己定义）。

在 A 中启动代码

```
        Intent intent = new Intent();
        //这里是采用的自定义action
        intent.setAction("transBundle.app");
        intent.putExtra("info", "名字");
        startActivity(intent);
```

可以传值。

## 通过包名类名

在 A 中启动代码

```
Intent intent = new Intent();
ComponentName componentName = new ComponentName("com.fta.appb",//这个是另外一个应用程																序的包名
											"com.fta.appb.SecondActivity");//这个													参数是要启动的Activity的全路径名

intent.setComponent(componentName);
startActivity(intent);
```

在 B 中清单文件中必须项

```
<category android:name="android.intent.category.DEFAULT" />
```

## 通过scheme启动

A 中启动代码

```
Uri uri = Uri.parse("app://my.test");
Intent intent = new Intent("transBundle.app", uri);
startActivity(intent);
```

B 中清单文件中

```
<intent-filter>
	<action android:name="transBundle.app" />
	<action android:name="android.intent.action.VIEW" />
	<category android:name="android.intent.category.DEFAULT" />
	<data
		android:host="my.test"
		android:scheme="app" />
</intent-filter>
```

只需要对应上就可以实现启动