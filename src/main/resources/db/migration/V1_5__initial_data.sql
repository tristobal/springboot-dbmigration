INSERT INTO school.student (id, name) VALUES (1, 'Walter');
INSERT INTO school.student (id, name) VALUES (2, 'Cristóbal');

INSERT INTO school.course (id, name) VALUES (1, 'Matemáticas');
INSERT INTO school.course (id, name) VALUES (2, 'Ciencias');
INSERT INTO school.course (id, name) VALUES (3, 'Historia');
INSERT INTO school.course (id, name) VALUES (4, 'Música');
INSERT INTO school.course (id, name) VALUES (5, 'Filosofía');

INSERT INTO school.course_registration (student_id, course_id, active) VALUES (1, 1, TRUE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (1, 2, TRUE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (1, 3, TRUE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (1, 4, TRUE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (2, 1, TRUE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (2, 4, FALSE);
INSERT INTO school.course_registration (student_id, course_id, active) VALUES (2, 5, FALSE);


