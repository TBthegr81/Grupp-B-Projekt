SELECT Movie_ID FROM Movie WHERE Name = "Two.and.a.Half.Men.S11E02.HDTV.x264-LOL.srt";

INSERT INTO Movie(Name) 
VALUES("The Matrix 1999 720p BRRip XviD AC3-FLAWL3SS-eng.srt");
INSERT INTO Movie(Name) 
VALUES("Tron.1982.Bluray.1080p.DTS-HD.x264-Grym.srt");



ALTER TABLE Movie
MODIFY COLUMN Name VARCHAR(200);

UPDATE Movie set Name="The Matrix 1999 720p BRRip XviD AC3-FLAWL3SS-eng.srt" WHERE Movie_ID = 1;

INSERT INTO Sub(Movie_ID,Sub_ID,FromTime,ToTime) VALUES(6,1, "00:00:49.16", "00:00:50.99");
INSERT INTO SubText(Sub_ID, Line) VALUES(3, "Hi thare how is it?");
INSERT INTO SubText(Sub_ID, Line) VALUES(3, "Oh im just good thank u");

SELECT * FROM Movie;
SELECT * FROM Sub;
SELECT * FROM SubText;

SELECT COUNT(ID) FROM Sub WHERE Movie_ID = 1;

DELETE FROM SubText WHERE SubText_ID > 0;
ALTER TABLE SubText AUTO_INCREMENT = 1;

DELETE FROM Sub WHERE ID > 0;
ALTER TABLE Sub AUTO_INCREMENT = 1;

DELETE FROM Movie WHERE Movie_ID > 0;
ALTER TABLE Movie AUTO_INCREMENT = 1;

SELECT
Sub.Sub_ID,
Sub.FromTime,
Sub.ToTime,
SubText.Line
FROM Sub
JOIN SubText
ON SubText.Sub_ID = Sub.ID
WHERE Sub.Movie_ID = 1
LIMIT 10000;

SELECT ID,Sub_ID, FromTime, ToTime FROM Sub WHERE Sub.Movie_ID = 4 LIMIT 10;
SELECT Line FROM SubText WHERE Sub_ID = 1;

SELECT ID FROM Sub ORDER BY ID DESC LIMIT 1;