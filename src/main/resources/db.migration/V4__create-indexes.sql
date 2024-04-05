CREATE TABLE UNIQUE INDEX events_slug_key ON events(slug);
CREATE TABLE UNIQUE INDEX attendees_event_id_email_key ON attendees(event_id, email);
CREATE TABLE UNIQUE INDEX check_ins_attendee_id_key ON check_ins(attendee_id);