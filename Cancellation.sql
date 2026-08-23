UPDATE reservations
SET status='CANCELLED'
WHERE pnr=? AND status='CONFIRMED';

UPDATE trains
SET available_seats = available_seats + 1
WHERE train_id=?;
