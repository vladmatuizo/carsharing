package epam.finalProject.carSharing.model.domain.mapper;

import epam.finalProject.carSharing.model.domain.entity.CarImage;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarImageMapper implements RowMapper<CarImage> {

    @Override
    public CarImage mapRow(ResultSet resultSet, int i) throws SQLException {
        CarImage carImage = new CarImage();
        carImage.setId(resultSet.getInt("idCarImage"));
        carImage.setImagePath(resultSet.getString("path"));
        carImage.setCarId(resultSet.getInt("car_id"));
        return carImage;
    }
}
