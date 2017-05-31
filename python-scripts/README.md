# Python tus client and authentication hook
Python script for uploading to a file to a tus server and a python hook script that the tus server can run before a file is uploaded in order to validate against AAP

## Installation
### tus client
- brew install python3 pip3, if not already installed
- pip3 install -r requirements.txt

### authentication hook
- copy pre_create_hook.py to tus server install dir under the specified hooks directory. See https://github.com/tus/tusd/blob/master/docs/hooks.md#the-hook-directory


### Usage
- python3 tus_client_test.py {username} {jwt token} {upload path on server} {upload path local}


