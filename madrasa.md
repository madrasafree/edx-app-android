Open edx Madrasa app

We have created an Android app based on the open edx android app, with some adjustments, for our open edx instance: 
https://github.com/madrasafree/edx-app-android

We have forked the repository edx-app-android in GitHub 
https://github.com/openedx/edx-app-android

We use our configuration and assets for branding designs and other customization (should be sibling directory)
https://github.com/madrasafree/edx_app_custom

We have implemented these modifications. 

1)	The app should always be in Hebrew, even if the device language is different. 

https://github.com/openedx/edx-app-android/commit/e64230bcd3ffcc64f3ec48fc095f840176ebad0c

2)	Registration form should include first name and last name fields, and submit the full name (needed for the edx account) by concatenating them (we have such customization on the web as well for marketing reasons). 

https://github.com/openedx/edx-app-android/commit/8a12b98f3ced1f20c3843af5990a7cdec9a401aa

3)	Webview should allow microphone usage and ask for permission when the microphone is needed.

https://github.com/openedx/edx-app-android/commit/0eafdbd8d9fd82b003789ff49d69cc1ad1a32654 
https://github.com/openedx/edx-app-android/commit/d2761a26614027ce18e49c158700dce4fd5cd27b

4)	Webview should support audio playing without a user gesture.

https://github.com/openedx/edx-app-android/commit/71fc595f08d579f5379f6d9645816e7f1ae755f7

5)	The app should support google authentication.

Bugs that we have encountered

1)	Hebrew/English -  Partly resolved - high importance - The app still appears in English and from left to right on some devices. It only happens on Xiaomi devices when installed while the device is in English.

2)	Registration with Google  Not resolved  - Medium importance -  It is impossible to register with the Google button from the app. It is possible to log in with an existing account connected to google from the web. 

3)	Discussions Not resolved - Low importance -  It is possible to read the discussions, but there is an error when writing or commenting.

 
4)	Enrollment resolved 
5)	Login with Google  - resolved 
6)	Compatibility with some devices which prevents installation - resolved 

