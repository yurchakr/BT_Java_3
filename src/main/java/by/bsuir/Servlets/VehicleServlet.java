package by.bsuir.Servlets;

import by.bsuir.autobase.dao.DaoFactory;
import by.bsuir.autobase.entity.Vehicle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class VehicleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Vehicle> vehicles = DaoFactory.getVehicleDAO().getVehicles();
        req.setAttribute("vehicleList", vehicles);
        PrintWriter writer = resp.getWriter();
        for (Vehicle veh: vehicles)
        {
            writer.println(veh.getMake());
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/vehicle.jsp");
        requestDispatcher.forward(req, resp);
    }
}
