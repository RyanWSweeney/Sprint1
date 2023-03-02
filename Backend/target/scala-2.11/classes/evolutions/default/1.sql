# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  security                      varchar(255),
  title                         varchar(255),
  research_area                 varchar(255),
  first_name                    varchar(255),
  last_name                     varchar(255),
  position                      varchar(255),
  affiliation                   varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  fax                           varchar(255),
  address                       varchar(255),
  city                          varchar(255),
  country                       varchar(255),
  zip                           varchar(255),
  comments                      varchar(255),
  status                        varchar(255),
  degree                        varchar(255),
  semester                      varchar(255),
  year                          varchar(255),
  month                         varchar(255),
  year2                         varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists user;

