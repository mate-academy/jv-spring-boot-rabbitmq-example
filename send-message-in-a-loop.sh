#!/bin/bash

# Loop indefinitely
while true; do
    # Execute the curl command
    curl --location 'http://localhost:8081/send' \
    --header 'Content-Type: application/json' \
    --data '{
        "content": "hello, mates!"
    }'
done
