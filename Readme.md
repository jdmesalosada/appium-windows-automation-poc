
### Tools:

* https://github.com/microsoft/WinAppDriver
* https://github.com/appium/appium-windows-driver


### Basic development tools:
* https://www.youtube.com/watch?v=XYKYv_xq3RQ&list=PLeo6Q1inqlOdJQtg5e-xr4-m7VahtLtFe&ab_channel=JulianMesa

### Tutorial Appium
* https://www.youtube.com/watch?v=CjxxX0F9jOk&ab_channel=JulianMesa



Install Nodejs.

Install appium: 
````
npm install -g appium
````

Start appium server:
````
appium
````

Install windows driver: 
````
appium driver install --source=npm appium-windows-driver
````

Unistall windows driver:

````
appium driver uninstall windows
````

Get the id from app to automate: Open powershell and run the command:
````
get-Startapps
````

## Troubleshooting
* In case you get the error: "Developer mode is not enabled. Enable it through Settings and restart Windows Application Driver"
Enable the developer mode in windows.

* In case you get the following error: Encountered internal error running command: Error: WinAppDriver server is not listening within 10000ms timeout. Make sure it could be started manually

Run windriver manually:
````
C:\Program Files\Windows Application Driver\WinAppDriver.exe 4724/wd/hub
````

The error I'm getting is with this Appium version: 2.5.4 and the windows driver is: 
windows@2.12.21
I will remove the current appium version and I will install a previous version, so uninstall
appium

```
npm uninstall -g appium
```

Check installed drivers:

```
appium driver ls
```

or 

```
appium driver list --installed
```

Uninstall driver:

```
appium driver uninstall windows
```

## Checking driver versions
In order to check the version of the windriver installed, just run the command appium
and you will see the available drivers with their versions.



