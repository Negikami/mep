-- Table: lyrics

DROP TABLE IF EXISTS lyrics;

CREATE TABLE IF NOT EXISTS lyrics
(
    id bigint PRIMARY KEY NOT NULL,
    lyric text
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS lyrics
    OWNER to postgres;
	
insert into lyrics (id,lyric) values (0,'We''re no strangers to love'),(
		1,'You know the rules and so do I (do I)'),(
		2,'A full commitment''s what I''m thinking of'),(
		3,'You wouldn''t get this from any other guy'),(
		4,'I just wanna tell you how I''m feeling'),(5,
		'Gotta make you understand'),(6,
		'Never gonna give you up'),(7,
		'Never gonna let you down'),(8,
		'Never gonna run around and desert you'),(9,
		'Never gonna make you cry'),(10,
		'Never gonna say goodbye'),(11,
		'Never gonna tell a lie and hurt you'),(12,
		'We''ve known each other for so long'),(13,
		'Your heart''s been aching, but you''re too shy to say it (say it)'),(14,
		'Inside, we both know what''s been going on (going on)'),(15,
		'We know the game and we''re gonna play it'),(16,
		'And if you ask me how I''m feeling'),(17,
		'Don''t tell me you''re too blind to see'),(18,
		'Never gonna give you up'),(19,
		'Never gonna let you down'),(20,
		'Never gonna run around and desert you'),(21,
		'Never gonna make you cry'),(22,
		'Never gonna say goodbye'),(23,
		'Never gonna tell a lie and hurt you'),(24,
		'Never gonna give you up'),(25,
		'Never gonna let you down'),(26,
		'Never gonna run around and desert you'),(27,
		'Never gonna make you cry'),(28,
		'Never gonna say goodbye'),(29,
		'Never gonna tell a lie and hurt you'),(30,
		'We''ve known each other for so long'),(31,
		'Your heart''s been aching, but you''re too shy to say it (to say it)'),(32,
		'Inside, we both know what''s been going on (going on)'),(33,
		'We know the game and we''re gonna play it'),(34,
		'I just wanna tell you how I''m feeling'),(35,
		'Gotta make you understand'),(36,
		'Never gonna give you up'),(37,
		'Never gonna let you down'),(38,
		'Never gonna run around and desert you'),(39,
		'Never gonna make you cry'),(40,
		'Never gonna say goodbye'),(41,
		'Never gonna tell a lie and hurt you'),(42,
		'Never gonna give you up'),(43,
		'Never gonna let you down'),(44,
		'Never gonna run around and desert you'),(45,
		'Never gonna make you cry'),(46,
		'Never gonna say goodbye'),(47,
		'Never gonna tell a lie and hurt you'),(48,
		'Never gonna give you up'),(49,
		'Never gonna let you down'),(50,
		'Never gonna run around and desert you'),(51,
		'Never gonna make you cry'),(52,
		'Never gonna say goodbye'),(53,
		'Never gonna tell a lie and hurt you');
select * from lyrics;