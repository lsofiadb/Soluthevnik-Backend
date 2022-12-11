CREATE OR REPLACE TRIGGER tg_update_v_total_price BEFORE
    INSERT ON raw_material_order_item
    FOR EACH ROW
DECLARE
    lsub_total      raw_material_order.v_total_price%TYPE;
    lv_total      raw_material_order.v_total_price%TYPE;
    lq_quantity   raw_material_order_item.q_quantity%TYPE;
    lv_unit_price raw_material_order_item.v_unit_price%TYPE;
BEGIN
--
    lq_quantity := :new.q_quantity;
    lv_unit_price := :new.v_unit_price;
    lsub_total := lq_quantity * lv_unit_price;
    
    SELECT v_total_price into lv_total from raw_material_order where k_id = :new.raw_material_order_id;
    
    UPDATE raw_material_order
    SET
        v_total_price = lv_total + lsub_total
    WHERE
        k_id = :new.raw_material_order_id;

END tg_update_v_total_price;


--pruebas del trigger
insert into raw_material_order_item(q_quantity,v_unit_price,raw_material_order_id,raw_material_id) values
(5,200,3,458);

insert into raw_material_order_item(q_quantity,v_unit_price,raw_material_order_id,raw_material_id) values
(3,200,3,369);
