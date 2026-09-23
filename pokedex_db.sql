create database pokedex_db;
use pokedex_db;

create table Usuarios(
 id int primary key not null,
 nombre_completo varchar(100),
 tipo_documento varchar(10),
 numero_identificacion varchar(100),
 fecha_nacimiento date,
 correo varchar (100) unique,
 numero_celular int,
 pais varchar(100),
 ciudad varchar(100),
 politica_datos boolean,
 pass varchar(100),
 fecha_registro date
 
 );
 
 create table Mochila(
 id int auto_increment  primary key,
 pokemon_id int,
 nombre varchar(100),
 imagen varchar(100),
 tipo varchar(50),
 experiencia_base int,
 es_favorito boolean default false,
 usuario_id int,
 FOREIGN KEY (usuario_id) REFERENCES usuario(id)
 
 
);


 
 