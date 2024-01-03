--Usuario
CREATE TABLE Usuario (
    id_usuario INT(5) PRIMARY KEY AUTO_INCREMENT,
    nombre_usuario VARCHAR(100) UNIQUE,
    correo VARCHAR(200) UNIQUE,
    contrasenia VARCHAR(40),
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    fecha_nacimiento DATE DEFAULT CURRENT_DATE,
    genero CHAR(1), -- H (HOMBRE), M (MUJER) Y O (OTRO)
    telefono VARCHAR(20),
    direccion VARCHAR(255),
    ciudad VARCHAR(60),
    estado VARCHAR(60),
    pais VARCHAR(60),
    codigo_postal VARCHAR(20),
    imagen_perfil TEXT, -- Cambiado a TEXT para campos de texto grandes como URLS
    fecha_registro DATE DEFAULT CURRENT_DATE
);

CREATE TABLE Contenido (
    id_contenido INT(5) PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT(5), FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario),
    titulo VARCHAR(100),
    descripcion VARCHAR(255),
    tipo_contenido VARCHAR(20),
    archivo BLOB, --BLOB para almacenar los archivos en binarios
    fecha_registro DATE DEFAULT CURRENT_DATE,
    fecha_modificacion DATE DEFAULT CURRENT_DATE
);

