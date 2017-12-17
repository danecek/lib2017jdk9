#!/bin/sh
java  --module-path \
osgi:\
derby:\
derbyDAO/target:\
utils/target:\
model/target:\
integration/target:\
business/target:\
richclient/target\
 --module richclient/lib2017.richclient.MainWindow

