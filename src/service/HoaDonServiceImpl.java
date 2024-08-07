/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import interfacee.hoaDonInterface;
import java.util.List;
import model.HoaDon;
import java.sql.*;
import connection.ConenctionProvider;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author trant
 */
public class HoaDonServiceImpl implements hoaDonInterface {

    Connection con = ConenctionProvider.getConnection();

    @Override
    public List<HoaDon> getAll() {

        try {
            List<HoaDon> list = new ArrayList<>();
            String sql = "SELECT * FROM HOADON";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt("id"));
                hd.setIDKhachHang(rs.getInt("idkh"));
                hd.setIdUser(rs.getInt("idNV"));
                hd.setMa(rs.getString("Ma"));
                hd.setNgayThanhToan(rs.getDate("NgayThanhToan"));
                hd.setTinhTrang(rs.getInt("TinhTrang"));
                hd.setGhichu(rs.getString("ghiChu"));
                hd.setTongTien(rs.getDouble("TongTien"));
                hd.setNgayTao(rs.getDate("NgayTao"));
                list.add(hd);

            }
            Collections.reverse(list); 
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean addHoaDon(HoaDon hd) {
        try {
            String sql = "insert into HoaDon(IdNV,Ma,TinhTrang) values(1,?,0)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, hd.getMa());
            stm.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean xoaHoaDon(HoaDon hd, int idHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateMaKHforHoaDon(int idKh, int idHD) {
        try {
            String sql = "UPDATE HoaDon SET IDKH = ? WHERE ID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idKh);
            stmt.setInt(2, idHD);
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updateTongTien(int idHD, double tongTien) {

        try {
            String sql = "UPDATE HoaDon SET tongTien = ? WHERE ID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDouble(1, tongTien);
            stmt.setInt(2, idHD);
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateThanhToan(int idHD) {
        
        try {
            String sql = "UPDATE HoaDon SET TinhTrang = 1,NgayThanhToan = GetDate() WHERE ID = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDouble(1, idHD);
            stmt.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

}
