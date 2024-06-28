# Demo REST API
Demo REST API is a personal playground 
to learn different programming technologies.

## Installation
You need:
- Java 17
- Docker
- Postgres

```bash
Get-ChildItem Env:
```

## Usage
- Get all records from database: GET http://localhost:8080/records
- Postgres Docker container environment variables:<br/>
docker run --hostname=af7db422e54d --mac-address=02:42:ac:11:00:02 --env=POSTGRES_PASSWORD=password --env=PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin --env=GOSU_VERSION=1.17 --env=LANG=en_US.utf8 --env=PG_MAJOR=16 --env=PG_VERSION=16.3 --env=PG_SHA256=331963d5d3dc4caf4216a049fa40b66d6bcb8c730615859411b9518764e60585 --env=DOCKER_PG_LLVM_DEPS=llvm15-dev 		clang15 --env=PGDATA=/var/lib/postgresql/data --volume=/var/lib/postgresql/data --network=bridge -p 8081:5432 --restart=no --runtime=runc -d postgres:16.3-alpine3.19
## License
[MIT](https://choosealicense.com/licenses/mit/)