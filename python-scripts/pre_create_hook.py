#! /usr/bin/python
import sys, json

def isJwtValid(jwt):
    # verify JWT with AAP
    return True

def getUserFromJwt(jwt):
    # use JWT parsing library to extract username from JWT
    return "rolando"

def checkUserHasPermissionToUploadPath(user, desiredPath):
    # look for some association between the user's domain and the path?
    return True

createData = json.load(sys.stdin)

jwt = createData["MetaData"]["Authorization"]
username = createData["MetaData"]["username"]
desiredPath = createData["MetaData"]["desiredPath"]

returnCode = 0 if isJwtValid(jwt) and (getUserFromJwt(jwt) == username) and checkUserHasPermissionToUploadPath(username, desiredPath) else 500

sys.exit(returnCode)
