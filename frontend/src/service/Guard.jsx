// src/service/Guard.jsx
import React from "react";
import { Navigate, useLocation } from "react-router-dom";
import ApiService from "./ApiService";

// For authenticated users (Admin + Manager)
export const ProtectedRoute = ({ element }) => {
  const location = useLocation();
  const isAuthenticated = ApiService.isAuthenticated();

  return isAuthenticated ? (
    element
  ) : (
    <Navigate to="/login" replace state={{ from: location }} />
  );
};

// For only Admin users
export const AdminRoute = ({ element }) => {
  const location = useLocation();
  const isAuthenticated = ApiService.isAuthenticated();
  const isAdmin = ApiService.isAdmin();

  return isAuthenticated && isAdmin ? (
    element
  ) : (
    <Navigate to="/login" replace state={{ from: location }} />
  );

};
