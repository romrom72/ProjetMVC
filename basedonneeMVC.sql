--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: mvc; Type: SCHEMA; Schema: -; Owner: r.locquet
--

CREATE SCHEMA mvc;


ALTER SCHEMA mvc OWNER TO "r.locquet";

--
-- Name: SCHEMA mvc; Type: COMMENT; Schema: -; Owner: r.locquet
--

COMMENT ON SCHEMA mvc IS 'Schema pour le Java sur MVC';


SET search_path = mvc, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: Division; Type: TABLE; Schema: mvc; Owner: r.locquet; Tablespace: 
--

CREATE TABLE "Division" (
    "codeDivision" integer NOT NULL,
    libelle character varying(50) NOT NULL
);


ALTER TABLE mvc."Division" OWNER TO "r.locquet";

--
-- Name: Eleve; Type: TABLE; Schema: mvc; Owner: r.locquet; Tablespace: 
--

CREATE TABLE "Eleve" (
    "codeEleve" integer NOT NULL,
    nom character varying(50) NOT NULL,
    prenom character varying(50) NOT NULL,
    "dateNaiss" character(50) NOT NULL,
    "codeDivision" integer NOT NULL
);


ALTER TABLE mvc."Eleve" OWNER TO "r.locquet";

--
-- Data for Name: Division; Type: TABLE DATA; Schema: mvc; Owner: r.locquet
--

INSERT INTO "Division" VALUES (1, 'seconde');
INSERT INTO "Division" VALUES (2, 'premiere');
INSERT INTO "Division" VALUES (3, 'terminal');
INSERT INTO "Division" VALUES (4, 'BTS');


--
-- Data for Name: Eleve; Type: TABLE DATA; Schema: mvc; Owner: r.locquet
--

INSERT INTO "Eleve" VALUES (1, 'Locquet', 'Romain', '12/03/1994                                        ', 4);
INSERT INTO "Eleve" VALUES (2, 'Pean', 'Valentin', '28/03/1994                                        ', 4);
INSERT INTO "Eleve" VALUES (3, 'Deslaurier', 'Baptiste', '14/09/1994                                        ', 4);


--
-- Name: Division_pkey; Type: CONSTRAINT; Schema: mvc; Owner: r.locquet; Tablespace: 
--

ALTER TABLE ONLY "Division"
    ADD CONSTRAINT "Division_pkey" PRIMARY KEY ("codeDivision");


--
-- Name: Eleve_pkey; Type: CONSTRAINT; Schema: mvc; Owner: r.locquet; Tablespace: 
--

ALTER TABLE ONLY "Eleve"
    ADD CONSTRAINT "Eleve_pkey" PRIMARY KEY ("codeEleve");


--
-- Name: Eleve_codeDivision_fkey; Type: FK CONSTRAINT; Schema: mvc; Owner: r.locquet
--

ALTER TABLE ONLY "Eleve"
    ADD CONSTRAINT "Eleve_codeDivision_fkey" FOREIGN KEY ("codeDivision") REFERENCES "Division"("codeDivision");


--
-- PostgreSQL database dump complete
--

