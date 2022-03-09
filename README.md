# api_empleados
crud basico api spring boot

crud basico api spring boot Este es un crud basico de empleados, que cuenta con las operaciones basicas de un crud guardar, consultar, actualizar y eliminar, ademas el endpoint de empleados se puede consultar por numero de indetificacion o por nombre.

Cree una bd en mysql con el nombre de employee, importe el proyecto en un ID de preferencia con java eclipse, intellij, spring tool suit y ejecute el proyecto.

endpoint para consultar a todos los empleados http://localhost:9090/v1/api/emploed/getall

consultar un empleado especifico http://localhost:9090/v1/api/emploed/getbyid/ ******** remplazar los asteriscos por un numero de documento

endpoint para guardar un empleado http://localhost:9090/v1/api/emploed/save/ su respectiva estructura { "id": "842753453", "documentType": "Cédula de ciudadanía", "names": "nuevo usuario ", "apellidos": "nuevo nuevo", "área": ​​"Ingeniería", "subárea": ​​"Desarrollo" }

endpoint para actualizar un empleado http://localhost:9090/v1/api/emploed/update/ su respectiva estructura { "id": "842753453", "documentType": "Cédula de ciudadanía", "names": "nuevo usuario ", "apellidos": "nuevo nuevo", "área": ​​"Ingeniería", "subárea": ​​"Desarrollo" }

endpoint para eliminar un empleado http://localhost:9090/v1/api/deletebyid/ ********** remplezar los astriscos por numero de documento

endpoint para eliminar un empleado http://localhost:9090/v1/api/getbyname/ ********** remplezar los astriscos por nombre

endpoint para eliminar un empleado http://localhost:9090/v1/api/getbyid/ ********** remplezar los astriscos por numero de documento

otros endpint que tambien tienen crud # http://localhost:9090/v1/api/area/getall # http://localhost:9090/v1/api/subarea/getall # http://localhost:9090/v1/api /tipodedocumento/getall
