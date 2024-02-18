# Instruction
1. Build docker image
    ```shell
    docker buildx build -t user-service:0.0.5 .
    ```
2. Add tag to image
    ```shell
    docker tag user-service:0.0.5 otuslearning/user-service:0.0.5
    ```
3. Push image
    ```shell
    docker push otuslearning/user-service:0.0.5
    ```