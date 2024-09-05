package ci.digitalacademy.MaCantine.Services.Mapper;

public interface EntityMapper<D,E>{

    D toDto(E entity);

    E toEntity(D dto);
}
