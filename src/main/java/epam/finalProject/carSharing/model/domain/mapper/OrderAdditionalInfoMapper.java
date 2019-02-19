package epam.finalProject.carSharing.model.domain.mapper;

import epam.finalProject.carSharing.model.domain.entity.OrderAdditionalInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderAdditionalInfoMapper implements RowMapper<OrderAdditionalInfo> {

    @Override
    public OrderAdditionalInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        OrderAdditionalInfo orderAdditionalInfo = new OrderAdditionalInfo();
        orderAdditionalInfo.setId(resultSet.getInt("idOrderAdditionalInfo"));
        orderAdditionalInfo.setInfoDetails(resultSet.getString("info_details"));
        orderAdditionalInfo.setPaymentForViolation(resultSet.getInt("payment_for_violation"));
        return orderAdditionalInfo;
    }
}
