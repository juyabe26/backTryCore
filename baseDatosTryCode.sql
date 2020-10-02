--
-- PostgreSQL database dump
--

-- Dumped from database version 12.4
-- Dumped by pg_dump version 12.4

-- Started on 2020-10-01 21:19:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16411)
-- Name: cat_genero; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cat_genero (
    id_genero bigint NOT NULL,
    cod_genero character varying(30) NOT NULL,
    des_genero character varying(50) NOT NULL
);


ALTER TABLE public.cat_genero OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 16657)
-- Name: cat_genero_id_genero_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.cat_genero ALTER COLUMN id_genero ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.cat_genero_id_genero_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999
    CACHE 1
);


--
-- TOC entry 208 (class 1259 OID 16975)
-- Name: cat_planetas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cat_planetas (
    id_planeta bigint NOT NULL,
    cod_planeta character varying NOT NULL,
    des_planeta character varying NOT NULL,
    contador integer
);


ALTER TABLE public.cat_planetas OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 16814)
-- Name: seq_id_genero; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.seq_id_genero
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 9999999
    CACHE 1;


ALTER TABLE public.seq_id_genero OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16818)
-- Name: seq_id_persona; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.seq_id_persona
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 9999999
    CACHE 1;


ALTER TABLE public.seq_id_persona OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16983)
-- Name: seq_id_planeta; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.seq_id_planeta
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 9999999
    CACHE 1;


ALTER TABLE public.seq_id_planeta OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16394)
-- Name: tbl_persona; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbl_persona (
    primer_nombre character varying(50) NOT NULL,
    primer_apellido character varying(50) NOT NULL,
    segundo_apellido character varying(50),
    fecha_nacimiento date NOT NULL,
    direccion character varying(50) NOT NULL,
    telefono numeric NOT NULL,
    id_persona bigint NOT NULL,
    id_genero integer NOT NULL,
    identificacion numeric NOT NULL,
    segundo_nombre character varying(50),
    uid character varying(30),
    edad integer,
    peso real,
    contador integer,
    id_planeta integer NOT NULL
);


ALTER TABLE public.tbl_persona OWNER TO postgres;

--
-- TOC entry 2852 (class 0 OID 0)
-- Dependencies: 202
-- Name: TABLE tbl_persona; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON TABLE public.tbl_persona IS 'Tabla para almacenamiento de personas';


--
-- TOC entry 2853 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN tbl_persona.primer_nombre; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tbl_persona.primer_nombre IS 'Campo que almacena el primer nombre de la persona';


--
-- TOC entry 2854 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN tbl_persona.primer_apellido; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tbl_persona.primer_apellido IS 'Campo que almacena el primer apellido de la persona';


--
-- TOC entry 2855 (class 0 OID 0)
-- Dependencies: 202
-- Name: COLUMN tbl_persona.segundo_apellido; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN public.tbl_persona.segundo_apellido IS 'Campo que almacena el segundo apellido de la persona';


--
-- TOC entry 205 (class 1259 OID 16661)
-- Name: tbl_persona_id_persona_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.tbl_persona ALTER COLUMN id_persona ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.tbl_persona_id_persona_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    MAXVALUE 99999999
    CACHE 1
);


--
-- TOC entry 2840 (class 0 OID 16411)
-- Dependencies: 203
-- Data for Name: cat_genero; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cat_genero (id_genero, cod_genero, des_genero) FROM stdin;
1	M	Masculino
2	F	Femenino
\.


--
-- TOC entry 2845 (class 0 OID 16975)
-- Dependencies: 208
-- Data for Name: cat_planetas; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cat_planetas (id_planeta, cod_planeta, des_planeta, contador) FROM stdin;
1	1	Mercurio	\N
2	2	Venus	\N
3	3	Tierra	\N
4	4	Marte	\N
5	5	Jupiter	\N
6	6	Saturno	\N
7	7	Urano	\N
8	8	Neptuno	\N
\.


--
-- TOC entry 2839 (class 0 OID 16394)
-- Dependencies: 202
-- Data for Name: tbl_persona; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbl_persona (primer_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, direccion, telefono, id_persona, id_genero, identificacion, segundo_nombre, uid, edad, peso, contador, id_planeta) FROM stdin;
Pepulio	Ramoncio	paz	2000-01-01	Calle 2 1 - 19	3103816321	24	1	1321310	perez	MFJIBGnX9uZyaU4sX7hDFY308qB2	80	91	\N	4
Caramelo	pepe	RANA	2001-01-01	RANA	1321	25	1	1231	RANA	MFJIBGnX9uZyaU4sX7hDFY308qB2	13213	213	3	2
SAPO	SAPO	SAPO	2001-01-01	Calle 2 1 - 19	3103816321	26	1	321321	SAPO	MFJIBGnX9uZyaU4sX7hDFY308qB2	121	212	14	2
julian	butron	rendon	1984-04-13	cale 13	123456	27	1	102315	andres	WOS6zL9NgXN36Aa5rxCa2sGJT8c2	33	75	1	2
\.


--
-- TOC entry 2856 (class 0 OID 0)
-- Dependencies: 204
-- Name: cat_genero_id_genero_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cat_genero_id_genero_seq', 3, true);


--
-- TOC entry 2857 (class 0 OID 0)
-- Dependencies: 206
-- Name: seq_id_genero; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_id_genero', 1, false);


--
-- TOC entry 2858 (class 0 OID 0)
-- Dependencies: 207
-- Name: seq_id_persona; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_id_persona', 27, true);


--
-- TOC entry 2859 (class 0 OID 0)
-- Dependencies: 209
-- Name: seq_id_planeta; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_id_planeta', 1, false);


--
-- TOC entry 2860 (class 0 OID 0)
-- Dependencies: 205
-- Name: tbl_persona_id_persona_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tbl_persona_id_persona_seq', 1, false);


--
-- TOC entry 2708 (class 2606 OID 16766)
-- Name: cat_genero cat_genero_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cat_genero
    ADD CONSTRAINT cat_genero_pkey PRIMARY KEY (id_genero);


--
-- TOC entry 2710 (class 2606 OID 16982)
-- Name: cat_planetas cat_planetas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cat_planetas
    ADD CONSTRAINT cat_planetas_pkey PRIMARY KEY (id_planeta);


--
-- TOC entry 2706 (class 2606 OID 16790)
-- Name: tbl_persona tbl_persona_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbl_persona
    ADD CONSTRAINT tbl_persona_pkey PRIMARY KEY (id_persona);


--
-- TOC entry 2711 (class 2606 OID 16767)
-- Name: tbl_persona persona_generofk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbl_persona
    ADD CONSTRAINT persona_generofk FOREIGN KEY (id_genero) REFERENCES public.cat_genero(id_genero);


--
-- TOC entry 2712 (class 2606 OID 16989)
-- Name: tbl_persona persona_planetafk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbl_persona
    ADD CONSTRAINT persona_planetafk FOREIGN KEY (id_planeta) REFERENCES public.cat_planetas(id_planeta);


-- Completed on 2020-10-01 21:19:25

--
-- PostgreSQL database dump complete
--

