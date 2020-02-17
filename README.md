![](https://habrastorage.org/webt/i4/vc/ut/i4vcut4xumyn9e51-37njhahkdo.png)

Привет! Твое задание - сделать так, чтобы при запуске `run.sh` запускался полностью рабочий проект.
В папке `frontend` лежит готовая страница, для которой тебе предстоит дописать backend-часть, 
а также настроить nginx так, чтобы он обращался по нужному адресу.


## Требования

Для сборки у вас должен быть установлен:
* npm
* docker
* docker-compose

Дополнительные правила:

* Бэкенд должен быть написан на java 11 с использованием [nab](https://github.com/hhru/nuts-and-bolts)
* У каждой сущности должны быть дата создания и дата последнего обновления
* Если поле не используется на фронте - не выводим его

## Бонусы за:
* Проксирование на /api сделано через nginx
* Есть тесты
* Использованы аннотации из JSR-330 и JAX-RS

## База данных
При запуске через `run.sh` запускается `docker-compose`, 
который запускает контейнер с postgresql и выполняет на ней скрипт `backend/init.sql`. 

Для локальной разработки можно запустить только контейнер postgres:

`docker-compose up postgres`

## Фронтенд
Открыть страницу из папки frontend можно с помощью команды
`npm install && npm run dev`
(доступна по адресу localhost:8080)

## API
Неочевидные нюансы api:
* Вакансии отдавайте с вложенным объектом company
* Отклики отдавайте с вложенным объектом resume
