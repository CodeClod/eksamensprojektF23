package com.miso.eksamensprojektf23.auth;


import com.srenhrkea.caravan.entities.Role;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
  private Long userId;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private Set<Role> roles;
}
