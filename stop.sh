#!/bin/sh
PID=$(cat ./logins.pid)
echo $PID
kill $PID
