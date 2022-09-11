[![Android][Android]][Android-url]
[![Kotlin][Kotlin]][Kotlin-url]
[![Jetpack-Compose][Jetpack-Compose]][Jetpack-Compose-url]
[![Ktor][Ktor]][Ktor-url]

<h1 align="center"> Boruto Anime App - MVVM</h1> <br>
<p align="center">
    <img alt="BorutoAnimeApp" title="Boruto Anime App" src="https://i.imgur.com/gJsfFfx.png" width="120">
  </a>
</p>

<p align="center">
  Built with Jetpack Compose, REST API and Ktor Server.
</p>

<p align="center">
  <a href="https://appgallery.cloud.huawei.com/ag/n/app/C106994733?channelId=Anime&id=98fcc3c6110d44d99254f0bcbfd66794&s=EE2CE9FA55184854D2F9B5EC118D4E1F2DB26568783D466EC7C518D2BAD6EB31&detailType=0&v=&callType=AGDLINK&installType=0000">
    <img alt="Download on the AppGallery Store" title="AppGallery" src="https://i.imgur.com/hDfphnM.png" width="300">
  </a>
  
* QR CODE : 

<p align="center">
    <img alt="App QR CODE" title="AppGallery APP QR CODE" src="https://i.imgur.com/VEFExZ0.png" width="300">
  </a>


<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Backend-Server](#backend)
- [Libraries](#libraries-and-technologies)


<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Introduction

Simple Android application that allows you to browse Boruto's characters.

<p align="center">
    <img alt="BorutoAnimeApp" title="Boruto Anime App" src="https://i.imgur.com/sLfpFHW.jpg">
  </a>
</p>
 
## Features

A few of the things you can do with Anime App:

* View Boruto's characters.
* Search for specific character.
* Swipe refresh after establishing connection.
* Slide Bottom Sheet in details screen.

## Backend

Used Ktor Framework for our back-end server. 


Check out the backend server repository by clicking on this link:
[Backend-repo]


## Libraries And Technologies

* Jetpack Compose
* ROOM Database
* Compose Navigation
* Dependency Injection with Dagger-Hilt
* Preferences DataStore
* Support for Dark and Light Themes
* Animate UI Components
* Animated Splash Screen
* SharedViewModel
* MVVM
* Transition Animations
* States in Jetpack Compose
* Templating
* Auto-Reload Server feature
* Paging 3 Library
* Offline Caching with Remote Mediator
* Shimmer Effect
* Palette API
* Retrofit


<!-- MARKDOWN LINKS & IMAGES -->
[Jetpack-Compose]: https://img.shields.io/static/v1?style=for-the-badge&message=Jetpack+Compose&color=4285F4&logo=Jetpack+Compose&logoColor=FFFFFF&label=
[Jetpack-Compose-url]: https://developer.android.com/jetpack/compose
[Android]: https://img.shields.io/static/v1?style=for-the-badge&message=Android&color=222222&logo=Android&logoColor=3DDC84&label=
[Android-url]: https://developer.android.com/
[Kotlin]: https://img.shields.io/static/v1?style=for-the-badge&message=Kotlin&color=7F52FF&logo=Kotlin&logoColor=FFFFFF&label=
[Kotlin-url]: https://kotlinlang.org/
[Ktor]: https://img.shields.io/badge/-8B89CC?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMDIiIGhlaWdodD0iNDgiIHZpZXdCb3g9IjAgMCAxMDIgNDgiPjxnIGZpbGw9Im5vbmUiPjxwYXRoIGZpbGw9IiNGMjY2MzYiIGQ9Ik0xNi4wMDQgMEwwIDE2LjAwNCAxNi4wMDQgMzJWMTYuMDA0SDMyeiIvPjxwYXRoIGZpbGw9IiM2MzczRkYiIGQ9Ik00OCAzMS45OTZMMzEuOTk2IDE2djE1Ljk5NkgxNkwzMS45OTYgNDh6Ii8+PHBhdGggZmlsbD0iIzI3MjgyQyIgZD0iTTMyIDE2SDE2djE2aDE2em0yOS43NTcgMTUuNzd2LTQuNDEybDEuNDYzLTEuNzIgNC4yODcgNi4xMzJoMy43MDRsLTUuNzYtOC4xMTQgNS4zODEtNi4zMjNoLTMuNDM4bC01LjQ1MyA2LjQ4M2gtLjE4NHYtNi40ODNoLTMuMDlWMzEuNzdoMy4wOXptMTEuNzI1LTEzLjY0NnYyLjczaC0xLjc2djIuMjEyaDEuNzZ2NS43MzNjMCAyLjE0IDEuMDg1IDMuMDExIDMuODI3IDMuMDExYTguNSA4LjUgMCAwMDEuNDk0LS4xM3YtMi4xNTFhNy4yIDcuMiAwIDAxLS44OC4wNWMtMS4wMTMgMC0xLjQ2My0uNDYtMS40NjMtMS40NXYtNS4wNjNoMi4zNDN2LTIuMjExSDc2LjQ2di0yLjczMWgtMi45Nzh6TTg2LjIxMSAzMmMzLjQ2OCAwIDUuNTU2LTIuMTQgNS41NTYtNS43NDMgMC0zLjU3MS0yLjExOC01Ljc0Mi01LjU1Ni01Ljc0MnMtNS41NTYgMi4xOC01LjU1NiA1Ljc0MmMwIDMuNTkyIDIuMDg3IDUuNzQzIDUuNTU2IDUuNzQzem0wLTIuMzAxYy0xLjU5NiAwLTIuNDk3LTEuMjYtMi40OTctMy40NDIgMC0yLjE2LjkxLTMuNDMxIDIuNDk3LTMuNDMxIDEuNTc1IDAgMi40OTYgMS4yNyAyLjQ5NiAzLjQzMSAwIDIuMTgxLS45MSAzLjQ0Mi0yLjQ5NiAzLjQ0MnptNy45OSAyLjA3aDIuOTc4di02LjE2MmMwLTEuNTUgMS4xMTUtMi41MDEgMi43NDItMi41MDEuNDgxIDAgMS4xNzcuMDggMS40MTIuMTZ2LTIuNTYxYy0uMjU1LS4wOC0uNzU3LS4xMy0xLjE2Ni0uMTMtMS40MzIgMC0yLjU5OS44My0yLjg5NiAxLjkzaC0uMTg0di0xLjc1aC0yLjg4NVYzMS43N3oiLz48L2c+PC9zdmc+Cg==&logoColor=white&style=for-the-badge&logoWidth=50
[Ktor-url]: https://ktor.io/
[Backend-repo]: https://github.com/SkanderThabet/AnimeServer/
