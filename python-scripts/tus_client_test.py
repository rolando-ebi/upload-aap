import sys
from tusclient import client


username = sys.argv[1]
jwt = sys.argv[2]
upload_path = sys.argv[3]
upload_path_local = sys.argv[4]

my_client = client.TusClient('http://localhost:1080/files/')

upload_metadata = { 'Authorization' : jwt, 'username' : username, 'desiredPath' : upload_path}

uploader = my_client.uploader(upload_path_local, metadata=upload_metadata, chunk_size=1000)

uploader.upload()
