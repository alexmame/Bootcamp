import React from 'react'

export const Header = () => {
    return (
        <>
            <div className="relative">
                <div className="bg-black py-4 px-6 flex justify-between items-center header-hidden">
                    <h1 className="text-white text-2xl font-bold">PRUEBA</h1>
                    <div>
                        <button className="bg-red-600 hover:bg-white text-black font-bold py-2 px-4 rounded mr-4">Botón 1</button>
                        <button className="bg-red-600 hover:bg-white text-black font-bold py-2 px-4 rounded">Botón 2</button>
                    </div>
                </div>
            </div>
        </>
    )
}
export default Header;
