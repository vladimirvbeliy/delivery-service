# delivery-service

Delivery Service CRM with REST Api

Contains:
- SQL scripts to create user, db and 2 tables Task and Address
- REST api for CRUD operations with Task:

        1. get certain Task entity;
        2. get all Task entities;
        3. create new entity;
        4. delete certain entity (also deletes associated Address entity);
        5. update certain entity;
- JSP-based UI, which allows to see all available Tasks, delete certain task (and also associated Address)
or view full info for it (including Address)
