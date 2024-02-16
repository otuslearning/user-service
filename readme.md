# Instruction
1. Build docker image
    ```shell
    docker buildx build -t user-service:latest .
    ```
2. Add tag to image
    ```shell
    docker tag user-service:latest otuslearning/user-service:latest
    ```
3. Push image
    ```shell
    docker push otuslearning/user-service:latest
    ```