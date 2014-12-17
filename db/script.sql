CREATE TABLE public.livro
(
       id serial, 
       isbn character varying(250), 
       titulo character varying(250), 
       descricao text, 
       preco numeric, 
       "dataPublicacao" timestamp without time zone, 
       PRIMARY KEY (id)
) 
WITH (
      OIDS = FALSE
)
;
ALTER TABLE public.livro
  OWNER TO fabricio;

