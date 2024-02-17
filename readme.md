# Instruction
1. Build docker image
    ```shell
    docker buildx build -t user-service:0.0.4 .
    ```
2. Add tag to image
    ```shell
    docker tag user-service:0.0.4 otuslearning/user-service:0.0.4
    ```
3. Push image
    ```shell
    docker push otuslearning/user-service:0.0.4
    ```