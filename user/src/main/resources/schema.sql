drop table if exists public.student;
CREATE TABLE public.student
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    name character(20) COLLATE pg_catalog."default" NOT NULL,
    age integer NOT NULL,
    email text COLLATE pg_catalog."default",
    CONSTRAINT student_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.student
    OWNER to cooler;