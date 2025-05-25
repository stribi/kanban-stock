
package com.kanbanstock.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AssemblyComponent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    @ManyToOne
    @JoinColumn(name = "assembly_id")
    private Assembly assembly;

    @ManyToOne
    @JoinColumn(name = "kit_id")
    private Kit kit;

    @ManyToOne
    @JoinColumn(name = "sub_assembly_id")
    private Assembly subAssembly;

    private int quantity;

}
