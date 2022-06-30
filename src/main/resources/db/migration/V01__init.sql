CREATE TABLE IF NOT EXISTS public.books
(
    id serial NOT NULL,
    name character varying(120) COLLATE pg_catalog."default" NOT NULL,
    category character(4) COLLATE pg_catalog."default",
    quantity integer NOT NULL,
    price integer NOT NULL,
    author_id integer NOT NULL,
    status character varying(120),
    CONSTRAINT books_pkey PRIMARY KEY (id)
    );

ALTER TABLE IF EXISTS public.books
    OWNER to "book";

INSERT INTO public.books( name, category, quantity, price, author_id, status)
VALUES ('Book 1', 'OLD', 20, 100, 1, 'START'),
       ('Book 2', 'OLD', 30, 100, 2, 'START'),
       ('Book 3', 'NEW', 30, 100, 3, 'START'),
       ('Book 4', 'NEW', 50, 100, 4, 'START'),
       ('Book 5', 'KID', 40, 100, 5, 'START');



CREATE TABLE IF NOT EXISTS public.users
(
    id serial NOT NULL,
    age integer,
    email character varying(120) COLLATE pg_catalog."default",
    name character varying(80) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
    );

ALTER TABLE IF EXISTS public.users
    OWNER to "book";

INSERT INTO public.users( name, email, age)
VALUES ('User 1', 'user1@gmail', 20),
       ('User 2', 'user2@gmail', 30),
       ('User 3', 'user3@gmail', 30),
       ('User 4', 'user4@gmail', 50),
       ('User 5', 'user5@gmail', 40);
